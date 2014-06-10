import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_biblehome_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/home.gsp" }
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
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("CCIM Chinese Christian GSword Online Bible Studio")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("CCIM,GSword,Jsword,Bible,Chinese,groovy,grails")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(5)
invokeTag('meta','feed',16,['kind':("rss"),'version':("2.0"),'controller':("gbook"),'action':("feed")],-1)
printHtmlPart(6)
expressionOut.print(createLinkTo(dir:pluginContextPath,file:'css/iBD.css'))
printHtmlPart(7)
invokeTag('javascript','g',19,['library':("application")],-1)
printHtmlPart(5)
invokeTag('modalIncludes','modalbox',20,[:],-1)
printHtmlPart(8)
invokeTag('javascript','g',20,['library':("prototype")],-1)
printHtmlPart(2)
invokeTag('autoComplete','resource',20,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'searchBible',

          params: '\'bible=\' + escape(bible.value)+\'&key=\'+key',
          onComplete: 'updateForm(e)'))
printHtmlPart(10)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'display',
            params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

            onComplete: 'updateForm(e)'))
printHtmlPart(11)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'getOsis',

            params: '\'bible=\' + escape(bible)+\'&reference=\'+escape(ref)+\'&start=\'+start+\'&limit=\'+limit',
            onComplete: 'updateForm(e)'))
printHtmlPart(12)
expressionOut.print(remoteFunction(
           controller:'gbook',
           action:'getChaps',
           params:'\'bible=\' + escape(bible)',
           onComplete:'updateChaptersbybook(bible,e)'))
printHtmlPart(13)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'searchDictionary',

            params: '\'dic=\' + escape(dic.value)+\'&key=\'+key.value',
            onComplete: 'updateDict(e)'))
printHtmlPart(14)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'daily',
            params: '\'bible=\' + escape(bible)',
             onComplete: 'updateForm(e)'))
printHtmlPart(15)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'ppt',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)',

             onComplete: 'openwin(e)'))
printHtmlPart(16)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipStrongs',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(17)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipMorph',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',
             onComplete: 'updateForm(e)'))
printHtmlPart(18)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipVline',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',
             onComplete: 'updateForm(e)'))
printHtmlPart(19)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'handleProtocol',
            params: '\'protoc=\' + escape(protocol)+\'&key=\'+lemma',
             onComplete: 'showProtocolData(e)'))
printHtmlPart(20)
})
invokeTag('javascript','g',438,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',439,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(21)
invokeTag('render','g',444,['template':("includes/hometmp")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',444,[:],1)
printHtmlPart(23)
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
