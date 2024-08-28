#!/bin/python
#
# Find nodes that have neighbours with teh same local ID
#
def find_conflicts(nodes):
    cntConflicts = 0
    conflicts = {}
    for node in nodes:
        nodeL = nodes[node]['Label']
        for neighB in nodes[node]['NeighB']:
            if neighB != node:
                if nodes[neighB]['Label'] == nodeL:
                    #print('Nodes %s and %s have same label %s'%(node, neighB, nodeL))
                    cntConflicts += 1
                    if node not in conflicts:
                        conflicts[node] = list(nodeL)
                    else:
                        conflicts[node].append(neighB)
    return cntConflicts, conflicts

def resolve_conflicts(nodes, conflicts, labels, verbose):
    ''' for each conflicted node, find a lable not used by any of its neighbours 
    '''
    for node in conflicts:
        nodeL = nodes[node]['Label']
        for l in labels:  # find a label not used by a neighbor
            used = False
            for neighB in nodes[node]['NeighB']:
                if l == nodes[neighB]['Label']:
                    used = True
                    break
            if not used:
                if verbose:
                    print('Changing node %s from %s to %s'%(node, nodeL, l))
                nodes[node]['Label'] = l
                break
        if used:
            # This implies more neighbors then labels
            print('Error! Could not resolve node %s with neighbours %r'%(node, nodes[node]['NeighB']))
    return nodes

import random
def buildNetwork(numNodes = 30000, numLabels = 128, maxNeighB = 64):
    ''' build and return a network of nodes, each with a label and neighbors.
    
    '''
    minNeighB = 2 
    # minimum neighbors must be at least 2
    
    # get the unique ID for each node as a string
    ids = [str(x) for x in range(1,numNodes)] # list of possible ids

    # get the unique name for each label
    labels = [str(x) for x in range(1,numLabels)]  # list of possible labels
    
    # this is where we will store the nodes
    nodes = {}
 
    # this will create each node
    for node in [str(x) for x in range(numNodes)]:
        nodes[node] = {}
        nodes[node]['Label'] = random.choice(labels)  # pick a Label at random
        numNeighbors = random.randrange(minNeighB, maxNeighB)  # how many neighbors will we have? 
        
        neighbors = [x for x in random.sample(ids, numNeighbors)]  # pick some neighbors at random
        if node in neighbors:  # we might have picked ourself, 
            neighbors.remove(node)  # this is why we have a minimum of 2 neighbors
        nodes[node]['NeighB'] = neighbors  # assign the neighbors to this node
    
    # make sure that if B is a neighbor of A, then A is a neighbor of B
    for node in [str(x) for x in range(numNodes)]:
        # make each node a neighbor of its neighbors (bi-directional graph)
        for neighB in nodes[node]['NeighB']:
            if node not in nodes[neighB]['NeighB']:
                nodes[neighB]['NeighB'].append(node)
    return nodes, labels


if __name__ == '__main__':
    # load the data for the network to analyse
    nodes, labels = buildNetwork()
    
    verbose = False  # Set to true to see what is happening
    
    # find out how many conflicts currently exist
    num, conflicts = find_conflicts(nodes)
    print ('Found %d conflicts'% num)
    
    # resolve them
    if num > 0:
        nodes = resolve_conflicts(nodes, conflicts, labels, verbose)
    
    # check them again. 
    num, conflicts = find_conflicts(nodes)
    print ('Found %d conflicts'% num)
    
    # write the Network back out to whom ever needs to know
    print('Done.')