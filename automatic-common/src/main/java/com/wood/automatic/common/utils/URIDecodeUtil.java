package com.wood.automatic.common.utils;

import com.wood.automatic.common.constants.Constants;
import com.wood.automatic.common.enums.ErrNoEnum;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

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
            log.error("{}:{}",ErrNoEnum.ERROR_DECODE.getMsg(),e.toString());
        }
        return s;
    }
    /**
     * 编码
     * @param unSecureString
     * @return
     */
    public static String encodeUri(String unSecureString){
        String s = "";

        try{
            s = URLEncoder.encode(unSecureString,Constants.UTF8);
        }catch(UnsupportedEncodingException e){
            log.error("{}:{}",ErrNoEnum.ERROR_ENCODE.getMsg(),e.toString());
        }
        return s;
    }
}
