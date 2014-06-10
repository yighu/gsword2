import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbookgeneralbooks_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/generalbooks.gsp" }
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
printHtmlPart(3)
expressionOut.print(params.id)
printHtmlPart(4)
expressionOut.print(params.key)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("CCIM Chinese Christian GSword Online Bible Studio ${params.id} ${params.key} ")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("CCIM,GSword,Jsword,Bible,Chinese,groovy,grails,classics ${params.id} ${params.key} ")],-1)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(6)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(7)
expressionOut.print(createLinkTo(dir: pluginContextPath, file: 'css/iBD.css'))
printHtmlPart(8)
invokeTag('javascript','g',17,['library':("prototype")],-1)
printHtmlPart(6)
invokeTag('javascript','g',19,['library':("application")],-1)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'display4g',
          params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)',

          onComplete: 'updateForm(e)'))
printHtmlPart(10)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'gentxtremote',

          params: '\'key=\' + escape(chap.value)',
          onComplete: 'updateFormgen(e)'))
printHtmlPart(11)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'gentxtremote',

          params: '\'key=\' + escape(chap.value)',
          onComplete: 'updateFormgen(e)'))
printHtmlPart(12)
})
invokeTag('javascript','g',64,[:],2)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',65,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(13)
invokeTag('message','g',68,['code':("classics")],-1)
printHtmlPart(14)
invokeTag('render','g',70,['template':("includes/generalbook")],-1)
printHtmlPart(15)
invokeTag('message','g',73,['code':("home")],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',75,[:],1)
printHtmlPart(17)
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
