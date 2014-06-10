import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bibleedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLinkTo(dir:''))
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',12,['class':("list"),'action':("list")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',13,['class':("create"),'action':("create")],2)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('renderErrors','g',22,['bean':(gbook),'as':("list")],-1)
printHtmlPart(14)
})
invokeTag('hasErrors','g',24,['bean':(gbook)],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(15)
expressionOut.print(gbook?.id)
printHtmlPart(16)
invokeTag('actionSubmit','g',35,['class':("save"),'value':("Update")],-1)
printHtmlPart(17)
invokeTag('actionSubmit','g',36,['class':("delete"),'onclick':("return confirm('Are you sure?');"),'value':("Delete")],-1)
printHtmlPart(18)
})
invokeTag('form','g',38,['method':("post")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',40,[:],1)
printHtmlPart(20)
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
