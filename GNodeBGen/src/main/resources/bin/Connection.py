#!/usr/bin/python

import socket
from _socket import SOL_SOCKET, SO_REUSEADDR


class ConnectionManager():
    
    """ TCP STREAM CONNECTION """

    def get_socket_connection(self):
        return self.__socket_connection


    def set_socket_connection(self, value):
        self.__socket_connection = value

    socket_connection = None
    
    def setConnectionType(self):
        """ setting connection type for TCP/IP """
        self.socket_connection = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    
    def setServerAddress(self, ip, port):
        """ return ip address and port address as a tuple """
        return (ip, port)
    
    def establishConnection(self, destIpAddress, destPortAddress):
        """ establish connection on socket with provided destination ip address and port address """
        dest_server_addr = self.setServerAddress(destIpAddress, destPortAddress)
        self.socket_connection.connect(dest_server_addr)
    
    def returnSourceAddress(self):
        """ return ip and port address of host/source connection """
        return self.socket_connection.getsockname()
    
        
    def streamRecords(self, record):
        """ send data on socket """
        self.socket_connection.sendall(record)
    
    def cleanSocket(self):
        self.socket_connection.close()
        
     
