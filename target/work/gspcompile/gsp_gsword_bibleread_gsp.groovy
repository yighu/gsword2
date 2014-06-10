import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bibleread_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/read.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)

def v = params.get("verse");

  def tt = ""

  if (book) {
    tt += " " + book?.initials
    if (bible) {
      tt += " " + bible?.shortname
      if (chap ) {
        tt += " " + chap
      //  println " v "+v
       if (v) {
        //  println "v:"+v
         tt += ":" + v
        }
      }
    }
  }
  
   tt+=" in the Bible "
  def ks=txt?.replaceAll("\\<.*?>","");

printHtmlPart(2)
createTagBody(1, {->
createTagBody(2, {->
createTagBody(3, {->
expressionOut.print(tt)
printHtmlPart(3)
expressionOut.print(ks)
printHtmlPart(4)
})
invokeTag('captureTitle','sitemesh',33,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',33,[:],2)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',37,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("${tt} ${ks} what does Bible say CCIM Chinese Christian GSword Online Bible Studio ")],-1)
printHtmlPart(6)
invokeTag('captureMeta','sitemesh',38,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("${keyword},${tt},${ks}, what does Bible say CCIM,word,GSword,Jsword,Bible,Chinese,groovy,grails")],-1)
printHtmlPart(6)
invokeTag('captureMeta','sitemesh',38,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(5)
invokeTag('javascript','g',38,['library':("prototype")],-1)
printHtmlPart(2)
invokeTag('javascript','g',39,['library':("application")],-1)
printHtmlPart(7)
expressionOut.print(createLinkTo(dir:pluginContextPath,file:'css/iBD.css'))
printHtmlPart(8)
invokeTag('javascript','g',41,['library':("prototype")],-1)
printHtmlPart(0)
invokeTag('javascript','g',43,['library':("application")],-1)
printHtmlPart(2)
invokeTag('modalIncludes','modalbox',43,[:],-1)
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
            action: 'searchDictionary',

            params: '\'dic=\' + escape(dic.value)+\'&key=\'+key.value',
            onComplete: 'updateDictp(e)'))
printHtmlPart(15)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'ontwitter',
            onComplete: 'twitter(e)'))
printHtmlPart(16)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'daily',
            params: '\'bible=\' + escape(bible)',
             onComplete: 'updateForm(e)'))
printHtmlPart(17)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'sendmail',
             params: '\'name=\' + escape(name.value)+\'&email=\'+escape(email.value)+\'&comment=\'+escape(comment.value)',
             onComplete: 'displaymailsendresponse(e)'))
printHtmlPart(18)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'ppt',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)',

             onComplete: 'openwin(e)'))
printHtmlPart(19)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipXRef',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(20)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipHeadings',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(21)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipStrongs',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(22)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipNotes',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',

             onComplete: 'updateForm(e)'))
printHtmlPart(23)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipMorph',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',
             onComplete: 'updateForm(e)'))
printHtmlPart(24)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'flipVline',
 params: '\'version=\' + escape(bible)+\'&key=\'+escape(reference)+\'&start=\'+verseStart+\'&limit=\'+verseLimit',
             onComplete: 'updateForm(e)'))
printHtmlPart(25)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'handleProtocol',
            params: '\'protoc=\' + escape(protocol)+\'&key=\'+lemma',
             onComplete: 'showProtocolData(e)'))
printHtmlPart(26)
})
invokeTag('javascript','g',553,[:],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(27)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'handleProtocol',
            params: '\'protoc=\' + escape(protocol)+\'&key=\'+lemma',
             onComplete: 'showProtocolData(e)'))
printHtmlPart(28)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'display4g',
          params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)',

          onComplete: 'updateForm(e)'))
printHtmlPart(29)
})
invokeTag('javascript','g',587,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',589,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(30)
expressionOut.print(tt)
printHtmlPart(31)
if(true && (layer==0)) {
printHtmlPart(5)
invokeTag('render','g',600,['template':("includes/versions")],-1)
printHtmlPart(2)
}
printHtmlPart(2)
if(true && (layer==1)) {
printHtmlPart(5)
invokeTag('render','g',602,['template':("includes/bibles")],-1)
printHtmlPart(2)
}
printHtmlPart(2)
if(true && (layer==2)) {
printHtmlPart(5)
invokeTag('render','g',602,['template':("includes/book")],-1)
printHtmlPart(2)
}
printHtmlPart(2)
if(true && (layer==3)) {
printHtmlPart(5)
invokeTag('render','g',605,['template':("includes/chapter")],-1)
printHtmlPart(2)
}
printHtmlPart(2)
if(true && (layer==4)) {
printHtmlPart(5)
invokeTag('render','g',605,['template':("includes/chapter")],-1)
printHtmlPart(2)
}
printHtmlPart(32)
expressionOut.print(txt)
printHtmlPart(33)
invokeTag('message','g',610,['code':("home")],-1)
printHtmlPart(34)
expressionOut.print(createLink(controller:'bible', action:'search'))
printHtmlPart(35)
expressionOut.print(createLink(controller:'gbook', action:'v'))
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',616,[:],1)
printHtmlPart(37)
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
