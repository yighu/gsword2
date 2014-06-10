import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_inclosetindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/incloset/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(4)
invokeTag('resource','g',8,['dir':("css"),'file':("jquery.mobile-1.1.0.min.css")],-1)
printHtmlPart(4)
invokeTag('javascript','g',9,['library':("application")],-1)
printHtmlPart(4)
invokeTag('javascript','g',10,['library':("prototype")],-1)
printHtmlPart(5)
invokeTag('layoutResources','r',14,[:],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(verses[0])
printHtmlPart(7)
expressionOut.print(verses[1])
printHtmlPart(8)
expressionOut.print(verses[2])
printHtmlPart(7)
expressionOut.print(verses[3])
printHtmlPart(9)
expressionOut.print(verses[4])
printHtmlPart(7)
expressionOut.print(verses[5])
printHtmlPart(10)
expressionOut.print(verses[6])
printHtmlPart(7)
expressionOut.print(verses[7])
printHtmlPart(11)
expressionOut.print(verses[8])
printHtmlPart(7)
expressionOut.print(verses[9])
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',98,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402284939000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
