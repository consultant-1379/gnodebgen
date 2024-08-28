#!/usr/bin/python
from json.encoder import JSONEncoder
from nodeWrapper import NodeWrapper
from cellWrapper import CellWrapper
from networkFunctionWrapper import NetworkFunctionWrapper
from ElementWrapper import ElementWrapper


class NodeDetailEncoder(JSONEncoder):
    
    def default(self, object):
        if isinstance(object, NodeWrapper) or isinstance(object, NetworkFunctionWrapper) or isinstance(object, CellWrapper) or isinstance(object, ElementWrapper):
            return object.__dict__
        else:
            return JSONEncoder.default(self, object)
