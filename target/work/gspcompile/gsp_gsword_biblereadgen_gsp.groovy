import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_biblereadgen_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/readgen.gsp" }
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
      tt += " " + bible?.name
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

printHtmlPart(2)
createTagBody(1, {->
createTagBody(2, {->
createTagBody(3, {->
expressionOut.print(tt)
printHtmlPart(3)
})
invokeTag('captureTitle','sitemesh',26,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',29,[:],2)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',34,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("CCIM Chinese Christian GSword Online Bible Studio")],-1)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',35,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("${keyword},CCIM,GSword,Jsword,Bible,Chinese,groovy,grails")],-1)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',36,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',36,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(tt)
printHtmlPart(7)
if(true && (layer==0)) {
printHtmlPart(4)
invokeTag('render','g',40,['template':("includes/genbook")],-1)
printHtmlPart(2)
}
printHtmlPart(8)
expressionOut.print(txt)
printHtmlPart(9)
expressionOut.print(createLink(controller:'bible', action:'search'))
printHtmlPart(10)
expressionOut.print(createLink(controller:'gbook', action:'v'))
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',44,[:],1)
printHtmlPart(12)
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
