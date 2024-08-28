#!/usr/bin/python


class CellWrapper:
    
    __cellLocalId = None
    __nCI = None

    def get_cell_local_id(self):
        return self.__cellLocalId

    def get_n_ci(self):
        return self.__nCI

    def set_cell_local_id(self, value):
        self.__cellLocalId = value

    def set_n_ci(self, value):
        self.__nCI = value

