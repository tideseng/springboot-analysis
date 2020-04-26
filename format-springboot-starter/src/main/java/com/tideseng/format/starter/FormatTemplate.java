package com.tideseng.format.starter;

import com.tideseng.format.starter.autoconfiguration.FormatProperties;
import com.tideseng.format.starter.format.FormatProcessor;

/**
 * 格式化模板，只用关心接口，不关心实现类，具体用哪个实现类交给被依赖的项目
 */
public class FormatTemplate {

    private FormatProcessor formatProcessor;

    private FormatProperties formatProperties;

    public FormatTemplate(FormatProperties formatProperties, FormatProcessor formatProcessor) {
        this.formatProperties = formatProperties;
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("FormatProperties--> ").append(formatProcessor.format(formatProperties.getInfo())).append("\r\n");
        stringBuilder.append("FormatResult--> ").append(formatProcessor.format(obj)).append("\r\n");
        return stringBuilder.toString();
    }
}
