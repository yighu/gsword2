import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsworderror_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/error.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',25,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',26,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(exception.message?.encodeAsHTML())
printHtmlPart(7)
expressionOut.print(exception.cause?.message?.encodeAsHTML())
printHtmlPart(8)
expressionOut.print(exception.className)
printHtmlPart(9)
expressionOut.print(exception.lineNumber)
printHtmlPart(10)
for( cs in (exception.codeSnippet) ) {
printHtmlPart(11)
expressionOut.print(cs?.encodeAsHTML())
printHtmlPart(12)
}
printHtmlPart(13)
for( _it1176791018 in (exception.stackTraceLines) ) {
changeItVariable(_it1176791018)
expressionOut.print(it.encodeAsHTML())
printHtmlPart(14)
}
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(16)
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
