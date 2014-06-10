import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_includes_generalbookdetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/includes/_generalbookdetail.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('javascript','g',2,['library':("application")],-1)
printHtmlPart(1)
invokeTag('modalIncludes','modalbox',3,[:],-1)
printHtmlPart(2)
invokeTag('message','g',7,['code':("studio")],-1)
printHtmlPart(3)
invokeTag('message','g',11,['code':("help")],-1)
printHtmlPart(4)
invokeTag('message','g',17,['code':("searchbible")],-1)
printHtmlPart(5)
invokeTag('select','g',21,['name':("books"),'id':("books"),'class':("books"),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("expGenerics();")],-1)
printHtmlPart(6)
invokeTag('message','g',24,['code':("lookup")],-1)
printHtmlPart(7)
invokeTag('message','g',28,['code':("choosebook")],-1)
printHtmlPart(8)
invokeTag('select','g',40,['name':("bibles"),'id':("bibles"),'class':("bibles"),'noSelection':(['':'']),'from':(bibles),'optionValue':("shortname"),'optionKey':("key"),'onchange':(remoteFunction(
           controller:'gbook',
           action:'getChaps',
           params:'\'bible=\' + escape(this.value)',
           onComplete:'updateChapters(e)'))],-1)
printHtmlPart(9)
invokeTag('message','g',43,['code':("oneyearbible")],-1)
printHtmlPart(10)
invokeTag('select','g',47,['name':("dailyword"),'class':("dailyword"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("showword(this.value); ")],-1)
printHtmlPart(11)
invokeTag('message','g',60,['code':("total")],-1)
printHtmlPart(12)
expressionOut.print(total)
printHtmlPart(13)
invokeTag('message','g',64,['code':("default.paginate.prev")],-1)
printHtmlPart(14)
invokeTag('message','g',65,['code':("default.paginate.next")],-1)
printHtmlPart(15)
invokeTag('message','g',68,['code':("strongs")],-1)
printHtmlPart(16)
invokeTag('message','g',76,['code':("verseperline")],-1)
printHtmlPart(17)
createTagBody(1, {->
invokeTag('message','g',82,['code':("locale.language.zh")],-1)
})
invokeTag('link','g',82,['action':("language_change"),'params':([lang:'zh_CN']),'title':("click to use Chinese")],1)
printHtmlPart(18)
createTagBody(1, {->
invokeTag('message','g',84,['code':("locale.language.en")],-1)
})
invokeTag('link','g',84,['action':("language_change"),'params':([lang:'en_US']),'title':("click to use English")],1)
printHtmlPart(19)
invokeTag('message','g',85,['code':("donation")],-1)
printHtmlPart(20)
invokeTag('createLink','modalbox',86,['controller':("gbook"),'action':("contactus"),'title':("Comments"),'width':("400"),'linkname':("Comments")],-1)
printHtmlPart(21)
invokeTag('message','g',92,['code':("books")],-1)
printHtmlPart(22)
if(true && (bibles)) {
printHtmlPart(23)
loop:{
int i = 0
for( b in (bibles) ) {
printHtmlPart(24)
expressionOut.print(b.shortname)
printHtmlPart(25)
expressionOut.print(b)
printHtmlPart(26)
expressionOut.print(b.key)
printHtmlPart(27)
expressionOut.print(b.shortname)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
}
printHtmlPart(30)
invokeTag('message','g',109,['code':("chapters")],-1)
printHtmlPart(31)
expressionOut.print(txt)
printHtmlPart(32)
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
