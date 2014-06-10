import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_includes_generalbook_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/includes/_generalbook.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( book in (books) ) {
printHtmlPart(1)
createTagBody(2, {->
expressionOut.print(book.name.encodeAsHTML())
printHtmlPart(2)
})
invokeTag('link','g',4,['action':("c"),'id':(book.initials)],2)
printHtmlPart(3)
i++
}
}
printHtmlPart(4)
invokeTag('message','g',14,['code':("selectchapter")],-1)
printHtmlPart(5)
invokeTag('select','g',16,['name':("genbooksch"),'id':("genbooksch"),'width':("600px"),'from':(gendropdowntoc),'value':("name"),'optionKey':("value"),'optionValue':("value"),'onchange':("searchGen();")],-1)
printHtmlPart(6)
expressionOut.print(txt)
printHtmlPart(7)
invokeTag('message','g',31,['code':("selectchapter")],-1)
printHtmlPart(5)
invokeTag('select','g',33,['name':("genbooksch2"),'id':("genbooksch2"),'from':(gendropdowntoc),'value':("name"),'optionKey':("value"),'optionValue':("value"),'onchange':("searchGen2();")],-1)
printHtmlPart(8)
expressionOut.print(toc)
printHtmlPart(9)
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
