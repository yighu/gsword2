import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_advsearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/_advsearch.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('textField','g',9,['name':("phrase"),'onblur':("doSearch();")],-1)
printHtmlPart(1)
invokeTag('textField','g',17,['name':("inwords"),'onblur':("doSearch();")],-1)
printHtmlPart(2)
invokeTag('textField','g',25,['name':("exwords"),'onblur':("doSearch();")],-1)
printHtmlPart(3)
invokeTag('textField','g',33,['name':("seems"),'onblur':("doSearch();")],-1)
printHtmlPart(4)
invokeTag('textField','g',41,['name':("starts"),'onblur':("doSearch();")],-1)
printHtmlPart(5)

def books = org.crosswire.bibledesktop.book.Msg.PRESETS.toString().split("\\|")

printHtmlPart(6)
invokeTag('select','g',55,['name':("range"),'from':(books),'onchange':("doSearch();"),'onblur':("doSearch();")],-1)
printHtmlPart(7)
invokeTag('textField','g',60,['id':("customrange"),'name':("customrange")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402147071000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
