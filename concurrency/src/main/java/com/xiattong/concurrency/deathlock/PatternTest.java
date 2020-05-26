package com.xiattong.concurrency.deathlock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        /*String line = "<h1>大家好，我是${teacher}老师<br/>欢迎大家一起来探索Spring的世界</h1>";
        Pattern pattern = Pattern.compile("\\$\\{[^\\}]+\\}",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        if(matcher.find()){
            String paraName = matcher.group().replaceAll("\\$\\{|\\}","");
            System.out.println(paraName);
        }*/

        String context = "public .* com.xiattong.biz.service..*Service..*(.*)";
        String pointCut = context
                .replaceAll("\\.","\\\\.")
                .replaceAll("\\\\.\\*",".*")  // \.* --> .*
                .replaceAll("\\(","\\\\(")
                .replaceAll("\\)","\\\\)");
        //  public .* com\.xiattong\.biz\.service\..*Service\..*\(.*\)
        //  public \.* com\.xiattong\.biz\.service\.\.*Service\.\.*\(\.*\)
        System.out.println(pointCut);
        pointCut = pointCut.substring(0,pointCut.lastIndexOf("\\(") -4);
        System.out.println(pointCut);
        pointCut = pointCut.substring(pointCut.lastIndexOf(" ") + 1);
        System.out.println(pointCut);

    }
}
