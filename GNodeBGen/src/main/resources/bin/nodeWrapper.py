#!/usr/bin/python


class NodeWrapper():

    __managedElement = None
    __networkFnDetailsMap = None
    __listOfNci = []
    __uniqueNciCount = 0
    
    def get_unique_nci_count(self):
        return self.__uniqueNciCount

    def set_unique_nci_count(self):
        self.__uniqueNciCount = len(self.__listOfNci)

    def get_list_of_nci(self):
        return self.__listOfNci

    def set_list_of_nci(self, value):
        self.__listOfNci = value

    def get_managed_element(self):
        return self.__managedElement

    def get_network_fn_details_map(self):
        return self.__networkFnDetailsMap

    def set_managed_element(self, value):
        self.__managedElement = value

    def set_network_fn_details_map(self, value):
        self.__networkFnDetailsMap = value

