import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbooksearchdics_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/searchdics.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)

//System.out.println "total:"+total   +" totalkeye:"+totalkeye+" totalkeyc:"+totalkeyc +" totalkeycs:"+totalkeycs
  def v = params.get("verse");

  def tt = ""
  def h = ""
  if (keyword) {
    tt += keyword
    h += keyword
    if (bibleversion) {
      if (params?.containsKey("offset")) {
        tt += " - " + params.get("offset")
      }
      tt += " in the Bible " + bibleversion
      h += " in the Bible " + bibleversion
    }

  }
  def ks = txt?.replaceAll("\\<.*?>", "");

printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('resources','gui',25,['components':("autoComplete"),'mode':("debug")],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
expressionOut.print(tt)
printHtmlPart(4)
expressionOut.print(ks)
})
invokeTag('captureTitle','sitemesh',31,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',32,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',33,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("${tt} CCIM Chinese Christian GSword Online Bible Studio Dictionary")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',35,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("${keyword},${tt},${ks}CCIM,word,GSword,Jsword,Bible,Chinese,groovy,grails,dictionary")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',35,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(3)
invokeTag('javascript','g',35,['library':("prototype")],-1)
printHtmlPart(3)
invokeTag('javascript','g',36,['library':("application")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
expressionOut.print(remoteFunction(
            controller: 'gbook',
            action: 'searchDictionary',

            params: '\'dic=\' + escape(dic.value)+\'&key=\'+key.value',
            onComplete: 'updateDict(e)'))
printHtmlPart(7)
expressionOut.print(remoteFunction(
          controller: 'gbook',
          action: 'display4g',
          params: '\'bible=\' + escape(bible)+\'&key=\'+escape(reference)',

          onComplete: 'updateForm(e)'))
printHtmlPart(8)
})
invokeTag('javascript','g',70,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',75,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',75,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('message','g',80,['code':("searchword")],-1)
printHtmlPart(11)
invokeTag('autoComplete','gui',96,['id':("key"),'controller':("gbook"),'action':("suggestedkeys"),'idField':("id"),'resultName':("keys"),'forceSelection':("true"),'dependsOn':("dic"),'useShadow':("false")],-1)
printHtmlPart(12)
invokeTag('textField','g',97,['name':("key")],-1)
printHtmlPart(13)
invokeTag('message','g',99,['code':("selectdic")],-1)
printHtmlPart(14)
invokeTag('select','g',111,['name':("dic"),'id':("dic"),'class':("dictionaries"),'noSelection':(['easton':'Eastons Bible Dictionary']),'from':(dictionaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchDictionary(); ")],-1)
printHtmlPart(15)
invokeTag('message','g',112,['code':("lookupdict")],-1)
printHtmlPart(16)
})
invokeTag('form','g',115,[:],2)
printHtmlPart(17)
expressionOut.print(keyword)
printHtmlPart(18)
expressionOut.print(keyvalue)
printHtmlPart(19)
if(true && (bookkey)) {
printHtmlPart(20)
expressionOut.print(dic)
printHtmlPart(21)
invokeTag('paginate','g',131,['total':(bookkey.getCardinality()),'controller':("gbook"),'action':("searchdics"),'params':(["":"${dic?.trim()}"])],-1)
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('render','g',132,['template':("includes/dictionaries")],-1)
printHtmlPart(24)
invokeTag('message','g',136,['code':("home")],-1)
printHtmlPart(25)
expressionOut.print(createLink(controller: 'bible', action: 'read'))
printHtmlPart(26)
invokeTag('message','g',141,['code':("searchbible")],-1)
printHtmlPart(27)
expressionOut.print(createLink(controller: 'gbook', action: 'v'))
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',145,['class':("yui-skin-sam")],1)
printHtmlPart(29)
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
