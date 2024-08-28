'''
Created on Jul 23, 2019

@author: xmanabh
'''
from json.encoder import JSONEncoder
from ArgumentGenerator import ArgumentGenerator


class ArgumentJsonEncoder(JSONEncoder):

    def default(self, classObject):
        if isinstance(classObject, ArgumentGenerator):
            return classObject.__dict__
        else:
            return JSONEncoder.default(self, classObject)
