package com.learnjava.BanKan.util;

import org.springframework.web.context.request.WebRequest;

public class RequestUtil {
   public static String getRequestPath(WebRequest req) {
        return req.getDescription(false).substring(4);
   }
}
