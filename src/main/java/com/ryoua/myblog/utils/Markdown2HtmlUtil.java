package com.ryoua.myblog.utils;

import com.vladsch.flexmark.Extension;
import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.ParserEmulationProfile;
import com.vladsch.flexmark.util.options.MutableDataSet;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author ryoua Created on 2019-05-16
 */
public class Markdown2HtmlUtil {
    /**
     * 将markdown源码转换成html返回
     *
     * @param markdown md源码
     * @return html代码
     */
    public static String markdown2html(String markdown) {
        MutableDataSet options = new MutableDataSet();
        options.setFrom(ParserEmulationProfile.MARKDOWN);
        options.set(Parser.EXTENSIONS, Collections.singletonList(TablesExtension.create()));
        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        Node document = parser.parse(markdown);
        return renderer.render(document);
    }
}
