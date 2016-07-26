package com.gradDesign.smms.utils;

/**
 * 解决json包含html标签无法显示的问题:要是在json中包含html标签的话，在js接收数据的时候就会出现问题，导致接收失败。
 * 所以在java端，对json包含有html标签的句子先进行转义。
 * @author hhf
 *
 */
public class HtmlEncode {
	public static String htmlEncode(String source) {
        if (source == null) {
            return "";
        }
        String html = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            switch (c) {
            case '<':
                buffer.append("&lt;");
                break;
            case '>':
                buffer.append("&gt;");
                break;
            case '&':
                buffer.append("&amp;");
                break;
            case '"':
                buffer.append("&quot;");
                break;
            case 13:
                break;
            default:
                buffer.append(c);
            }
        }
        html = buffer.toString();
        return html;
    }
}
