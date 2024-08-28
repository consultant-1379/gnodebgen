#!/usr/bin/python


class NetworkFunctionWrapper:
    
    __gNBId = None
    __gNBIdLength = None
    __cellList = None
    __plmnIdList = None
    __gnbFunctionId = None
    __remoteEndPointMap = None
    __localEndPointMap = None
    __cellRelationMap = None

    def get_g_nbid(self):
        return self.__gNBId

    def get_g_nbid_length(self):
        return self.__gNBIdLength

    def get_cell_list(self):
        return self.__cellList

    def get_plmn_id_list(self):
        return self.__plmnIdList

    def get_gnb_function_id(self):
        return self.__gnbFunctionId

    def get_remote_end_point_map(self):
        return self.__remoteEndPointMap

    def get_local_end_point_map(self):
        return self.__localEndPointMap

    def get_cell_relation_map(self):
        return self.__cellRelationMap

    def set_g_nbid(self, value):
        self.__gNBId = value

    def set_g_nbid_length(self, value):
        self.__gNBIdLength = value

    def set_cell_list(self, value):
        self.__cellList = value

    def set_plmn_id_list(self, value):
        self.__plmnIdList = value

    def set_gnb_function_id(self, value):
        self.__gnbFunctionId = value

    def set_remote_end_point_map(self, value):
        self.__remoteEndPointMap = value

    def set_local_end_point_map(self, value):
        self.__localEndPointMap = value

    def set_cell_relation_map(self, value):
        self.__cellRelationMap = value

