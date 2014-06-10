import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_biblesearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/search.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)

//System.out.println "total:"+total   +" totalkeye:"+totalkeye+" totalkeyc:"+totalkeyc +" totalkeycs:"+totalkeycs
  def v = params.get("verse");

  def tt = ""
  def h=""
  if (keyword) {
    tt += keyword
    h+=keyword
    if (bibleversion) {
    if (params?.containsKey("offset")){
      tt+= " - "+params.get("offset")      
    }
      tt += " in the Bible " + bibleversion
      h += " in the Bible " + bibleversion
    }

  }
 def ks=txt?.replaceAll("\\<.*?>","");

printHtmlPart(2)
createTagBody(1, {->
createTagBody(2, {->
createTagBody(3, {->
expressionOut.print(tt)
printHtmlPart(3)
expressionOut.print(ks)
})
invokeTag('captureTitle','sitemesh',29,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',29,[:],2)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',32,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("${tt} what does Bible say CCIM Chinese Christian GSword Online Bible Studio")],-1)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',33,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("${keyword},${tt},${ks},what does Bible say CCIM,word,GSword,Jsword,Bible,Chinese,groovy,grails")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',33,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(4)
invokeTag('javascript','g',33,['library':("prototype")],-1)
printHtmlPart(2)
invokeTag('javascript','g',34,['library':("application")],-1)
printHtmlPart(6)
expressionOut.print(createLinkTo(dir:pluginContextPath,file:'css/iBD.css'))
printHtmlPart(7)
invokeTag('javascript','g',36,['library':("prototype")],-1)
printHtmlPart(0)
invokeTag('javascript','g',38,['library':("application")],-1)
printHtmlPart(2)
invokeTag('modalIncludes','modalbox',38,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(8)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'searchBible',

          params: '\'bible=\' + escape(bible.value)+\'&key=\'+key',
          onComplete: 'updateForm(e)'))
printHtmlPart(9)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'display',
            params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

            onComplete: 'updateForm(e)'))
printHtmlPart(10)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'getOsis',

            params: '\'bible=\' + escape(bible)+\'&reference=\'+escape(ref)+\'&start=\'+start+\'&limit=\'+limit',
            onComplete: 'updateForm(e)'))
printHtmlPart(11)
expressionOut.print(remoteFunction(
           controller:'gbook',
           action:'getChaps',
           params:'\'bible=\' + escape(bible)',
           onComplete:'updateChaptersbybook(bible,e)'))
printHtmlPart(12)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'searchDictionary',

            params: '\'dic=\' + escape(dic.value)+\'&key=\'+key.value',
            onComplete: 'updateDict(e)'))
printHtmlPart(13)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'searchDictionary',

            params: '\'dic=\' + escape(dic.value)+\'&key=\'+key.value',
            onComplete: 'updateDictp(e)'))
printHtmlPart(14)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'ontwitter',
            onComplete: 'twitter(e)'))
printHtmlPart(15)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'daily',
            params: '\'bible=\' + escape(bible)',
             onComplete: 'updateForm(e)'))
printHtmlPart(16)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'sendmail',
             params: '\'name=\' + escape(name.value)+\'&email=\'+escape(email.value)+\'&comment=\'+escape(comment.value)',
             onComplete: 'displaymailsendresponse(e)'))
printHtmlPart(17)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'ppt',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)',

             onComplete: 'openwin(e)'))
printHtmlPart(18)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipXRef',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(19)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipHeadings',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(20)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipStrongs',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(21)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipNotes',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(22)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipMorph',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',
             onComplete: 'updateForm(e)'))
printHtmlPart(23)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipVline',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',
             onComplete: 'updateForm(e)'))
printHtmlPart(24)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'handleProtocol',
            params: '\'protoc=\' + escape(protocol)+\'&key=\'+lemma',
             onComplete: 'showProtocolData(e)'))
printHtmlPart(25)
})
invokeTag('javascript','g',550,[:],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(26)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'display4g',
          params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)',

          onComplete: 'updateForm(e)'))
printHtmlPart(27)
})
invokeTag('javascript','g',567,[:],2)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',572,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(28)
})
invokeTag('captureHead','sitemesh',573,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(29)
expressionOut.print(h)
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('hiddenField','g',583,['name':("version"),'value':(bibleversion)],-1)
printHtmlPart(31)
invokeTag('textField','g',586,['name':("key")],-1)
printHtmlPart(32)
invokeTag('actionSubmit','g',586,['class':("search"),'value':("Submit"),'action':("seek")],-1)
printHtmlPart(2)
})
invokeTag('form','g',587,['name':("searchform"),'method':("POST"),'url':([controller: "bible", action: "seek"])],2)
printHtmlPart(33)
invokeTag('render','g',588,['template':("includes/resultbykey")],-1)
printHtmlPart(2)
expressionOut.print(txt)
printHtmlPart(34)
invokeTag('render','g',589,['template':("includes/keye")],-1)
printHtmlPart(2)
invokeTag('render','g',589,['template':("includes/keyc")],-1)
printHtmlPart(2)
invokeTag('render','g',593,['template':("includes/keycs")],-1)
printHtmlPart(35)
expressionOut.print(createLink(controller:'bible', action:'read'))
printHtmlPart(36)
invokeTag('message','g',600,['code':("searchbible")],-1)
printHtmlPart(37)
expressionOut.print(createLink(controller:'gbook', action:'v'))
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',604,[:],1)
printHtmlPart(39)
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
