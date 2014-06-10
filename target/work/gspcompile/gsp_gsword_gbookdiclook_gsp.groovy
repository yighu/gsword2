import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbookdiclook_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/diclook.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("advancedsearch")],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',15,['code':("detailsearch")],-1)
printHtmlPart(5)
invokeTag('message','g',15,['code':("incphr")],-1)
printHtmlPart(6)
invokeTag('textField','g',17,['name':("keyp")],-1)
printHtmlPart(7)
invokeTag('message','g',21,['code':("srange")],-1)
printHtmlPart(8)
invokeTag('select','g',30,['name':("dictionariesp"),'id':("dictionariesp"),'class':("dictionaries"),'noSelection':(['easton':'Eastons Bible Dictionary']),'from':(dictionaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchDictionaryp(); ")],-1)
printHtmlPart(9)
invokeTag('message','g',33,['code':("search")],-1)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',39,[:],1)
printHtmlPart(11)
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
