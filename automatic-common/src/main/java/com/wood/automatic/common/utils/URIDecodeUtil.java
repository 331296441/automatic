package com.wood.automatic.common.utils;

import com.wood.automatic.common.constants.Constants;
import com.wood.automatic.common.enums.ErrNoEnum;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Slf4j
public class URIDecodeUtil {

    /**
     * 解码
     * @param secureString
     * @return
     */
    public static String decodeUri(String secureString){
        String s = "";
        try {
            s = URLDecoder.decode(secureString, Constants.UTF8);
        }catch (UnsupportedEncodingException e){
            log.error("{},{}",ErrNoEnum.ERROR_DECODE.getMsg(),e.toString());
        }
        return s;
    }
}
