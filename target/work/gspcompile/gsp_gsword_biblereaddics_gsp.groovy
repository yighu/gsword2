import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_biblereaddics_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/readdics.gsp" }
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
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(7)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'display4g',
          params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)',

          onComplete: 'updateForm(e)'))
printHtmlPart(8)
})
invokeTag('javascript','g',54,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',56,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(9)
expressionOut.print(tt)
printHtmlPart(10)
invokeTag('render','g',67,['template':("includes/vcmnt")],-1)
printHtmlPart(5)
invokeTag('render','g',68,['template':("includes/cmntbibles")],-1)
printHtmlPart(11)
expressionOut.print(txt)
printHtmlPart(12)
invokeTag('message','g',69,['code':("home")],-1)
printHtmlPart(13)
expressionOut.print(createLink(controller:'bible', action:'search'))
printHtmlPart(14)
expressionOut.print(createLink(controller:'gbook', action:'v'))
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(16)
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
