package com.vigalyn.cloud.framework.base;

import com.vigalyn.cloud.framework.core.dto.ResultDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ResultDTO<String> res = new ResultDTO<>("1231");
        System.out.println( "Hello World!"  + res.toString());
    }
}
