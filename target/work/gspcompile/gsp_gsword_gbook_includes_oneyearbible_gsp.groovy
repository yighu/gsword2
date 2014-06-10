import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_includes_oneyearbible_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/includes/_oneyearbible.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('javascript','g',1,['library':("application")],-1)
printHtmlPart(0)
invokeTag('message','g',4,['code':("subscribe")],-1)
printHtmlPart(1)
invokeTag('message','g',7,['code':("oneyearbible")],-1)
printHtmlPart(2)
invokeTag('select','g',9,['name':("dailyword"),'class':("books"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("showword(this.value); ")],-1)
printHtmlPart(3)
expressionOut.print(results)
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401760947000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
