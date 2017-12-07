package com.yy.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 鲁源源 on 2017/12/3.
 */
public class LevelUtil {

    public final static String SEPARATOR = ".";
    public final static String ROOT = "0";

    //部门level计算规则
    //0
    //0.1
    //0.1.2
    //0.1.3
    //0.4
    public static String calculateLevel(String parentLevel,int parentId){
        if(StringUtils.isBlank(parentLevel)){
            return ROOT;
        }else {
            return StringUtils.join(parentLevel,SEPARATOR,parentId);
        }
    }


}
