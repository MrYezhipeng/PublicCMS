package com.publiccms.views.pojo.model;

import java.util.List;

import com.publiccms.entities.cms.CmsDictionaryData;

/**
 *
 * CmsDictionaryParamters
 * 
 */
public class CmsDictionaryParamters implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<CmsDictionaryData> dataList;

    /**
     * @return the dataList
     */
    public List<CmsDictionaryData> getDataList() {
        return dataList;
    }

    /**
     * @param dataList
     *            the dataList to set
     */
    public void setDataList(List<CmsDictionaryData> dataList) {
        this.dataList = dataList;
    }

}