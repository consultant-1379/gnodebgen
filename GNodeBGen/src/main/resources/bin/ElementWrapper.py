class ElementWrapper():
    
    moFdn = None
    moClass = None

    attributeMap = {}

    def get_mo_fdn(self):
        return self.moFdn

    def get_mo_class(self):
        return self.moClass

    def get_attribute_map(self):
        return self.attributeMap

    def set_mo_fdn(self, value):
        self.moFdn = value
        self.set_mo_class(value)

    def set_mo_class(self, value):
        self.moClass = value.split(',')[-1].split('=')[0]

    def set_attribute_map(self, value):
        self.attributeMap = value
