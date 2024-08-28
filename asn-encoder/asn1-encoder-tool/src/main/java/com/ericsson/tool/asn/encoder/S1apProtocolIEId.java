//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import com.ericsson.tool.asn.lte.mapper.jaxb.ProtocolIEIDMapper;

public enum S1apProtocolIEId {
    ID_UE_AGG_MAX_BIT_RATE(ProtocolIEIDMapper.ID_U_EAGGREGATE_MAXIMUM_BITRATE, 66L),
    ID_RAB_TO_BE_SETUP_LIST_HO_REQ(ProtocolIEIDMapper.ID_E_RAB_TO_BE_SETUP_LIST_HO_REQ, 53L),
    ID_RAB_TO_BE_SETUP_ITEAM_HO_REQ(ProtocolIEIDMapper.ID_E_RAB_TO_BE_SETUP_ITEM_HO_REQ, 27L),
    ID_SOURCE_TARGET_TRANSPARENT_CONTAINER(ProtocolIEIDMapper.ID_SOURCE_TO_TARGET_TRANSPARENT_CONTAINER, 104L),
    ID_UE_CONTEXT_INFORMATION(ProtocolIEIDMapper.ID_UE_CONTEXT_INFORMATION, 14L);

    final ProtocolIEIDMapper protocolIEIDMapper;
    final long id;

    private S1apProtocolIEId(ProtocolIEIDMapper protocolIEIDMapper, long id) {
        this.protocolIEIDMapper = protocolIEIDMapper;
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public static S1apProtocolIEId fromName(ProtocolIEIDMapper protocolIEIDMapper) {
        S1apProtocolIEId[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            S1apProtocolIEId protocolIEId = var1[var3];
            if (protocolIEId.protocolIEIDMapper == protocolIEIDMapper) {
                return protocolIEId;
            }
        }

        throw new IllegalArgumentException("protocal " + protocolIEIDMapper + " not found");
    }
}
