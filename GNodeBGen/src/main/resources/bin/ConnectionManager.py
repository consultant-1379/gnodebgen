#!/usr/bin/python

'''
Created on Jul 18, 2019

@author: xmanabh
'''
import socket


class ConnectionManager(object):
    '''
    classdocs
    '''

    dest_ip, dest_port = None, None
    connection, connection_status = None, None

    def __init__(self, destination_ip, destination_port):
        self.dest_ip = destination_ip
        self.dest_port = destination_port
        self.connection = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    def get_sock_obj(self):
        return self.connection

    def establish_connection(self):
        self.connection.setblocking(1)
        self.connection.settimeout(3.0)
        self.connection.connect((self.dest_ip, self.dest_port))
        self.connection.setblocking(0)

    def set_connected(self):
        if self.connection_status != 'FAILED':
            self.connection_status = 'CONNECTED'

    def set_dropped(self):
        if self.connection_status != 'FAILED':
            self.connection_status = 'DROPPED'

    def set_failed(self):
        self.connection_status = 'FAILED'

    def get_status(self):
        return self.connection_status