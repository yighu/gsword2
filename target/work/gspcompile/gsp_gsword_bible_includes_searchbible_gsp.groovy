import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_searchbible_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_searchbible.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
invokeTag('hiddenField','g',2,['name':("version"),'value':(bibleversion)],-1)
printHtmlPart(1)
invokeTag('textField','g',3,['name':("key")],-1)
printHtmlPart(2)
invokeTag('actionSubmit','g',4,['class':("search"),'value':("Search Bible"),'action':("seek")],-1)
printHtmlPart(3)
})
invokeTag('form','g',5,['name':("searchform"),'method':("POST"),'url':([controller: "bible", action: "seek"])],1)
printHtmlPart(3)
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
