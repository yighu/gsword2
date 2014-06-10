import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_biblehelp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/help.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('textField','g',31,['name':("phrase")],-1)
printHtmlPart(6)
invokeTag('textField','g',41,['name':("inwords")],-1)
printHtmlPart(7)
invokeTag('textField','g',49,['name':("exwords")],-1)
printHtmlPart(8)
invokeTag('textField','g',58,['name':("seems")],-1)
printHtmlPart(9)
invokeTag('textField','g',65,['name':("starts")],-1)
printHtmlPart(10)

def books = org.crosswire.bibledesktop.book.Msg.PRESETS.toString().split("\\|")

printHtmlPart(11)
invokeTag('select','g',83,['name':("range"),'from':(books)],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',86,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401760946000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
