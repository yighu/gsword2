import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_searchdlg_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_searchdlg.gsp" }
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
invokeTag('message','g',16,['code':("searchword")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("searchbible")],-1)
printHtmlPart(6)
invokeTag('select','g',27,['name':("books"),'id':("books"),'class':("books"),'noSelection':(["${version}":"${version}"]),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchBible();")],-1)
printHtmlPart(7)
invokeTag('message','g',30,['code':("lookup")],-1)
printHtmlPart(8)
invokeTag('message','g',34,['code':("parallelbible")],-1)
printHtmlPart(9)
invokeTag('select','g',38,['name':("parallels"),'class':("parallels"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name")],-1)
printHtmlPart(10)
invokeTag('message','g',45,['code':("choosebook")],-1)
printHtmlPart(11)
invokeTag('select','g',57,['name':("bibles"),'id':("bibles"),'class':("bibles"),'noSelection':(['':'']),'from':(bibles),'optionValue':("shortname"),'optionKey':("key"),'onchange':(remoteFunction(
           controller:'gbook',
           action:'getChaps',
           params:'\'bible=\' + escape(this.value)',
           onComplete:'updateChapters(e)'))],-1)
printHtmlPart(12)
invokeTag('message','g',60,['code':("oneyearbible")],-1)
printHtmlPart(13)
invokeTag('select','g',64,['name':("dailyword"),'class':("dailyword"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("showword(this.value); ")],-1)
printHtmlPart(14)
invokeTag('createLink','modalbox',70,['controller':("gbook"),'action':("adsearch"),'title':("Advanced Search"),'width':("400"),'linkname':("Advanced Search")],-1)
printHtmlPart(15)
invokeTag('message','g',78,['code':("lookupdict")],-1)
printHtmlPart(16)
invokeTag('select','g',83,['name':("dictionaries"),'id':("dictionaries"),'class':("dictionaries"),'noSelection':(['easton':'Eastons Bible Dictionary']),'from':(dictionaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchDictionary(); ")],-1)
printHtmlPart(17)
invokeTag('message','g',85,['code':("verse")],-1)
printHtmlPart(18)
expressionOut.print(ref)
printHtmlPart(19)
invokeTag('message','g',92,['code':("lookup")],-1)
printHtmlPart(20)
invokeTag('message','g',93,['code':("commentaries")],-1)
printHtmlPart(21)
invokeTag('select','g',103,['name':("commentaries"),'id':("commentaries"),'class':("commentaries"),'noSelection':(['':'']),'from':(commentaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':(remoteFunction(
		           controller:'gbook',
		           action:'xindex',
		           params:'\'type=\' + escape(this.value)',
		           onComplete:'updateForm(e)'))],-1)
printHtmlPart(22)
invokeTag('message','g',111,['code':("choosechapter")],-1)
printHtmlPart(11)
invokeTag('select','g',119,['name':("chapters"),'class':("chapters"),'noSelection':(['':'']),'from':(chapters),'onchange':("updateReference(\$(\'bibles\').value+\' \'+ escape(this.value));")],-1)
printHtmlPart(23)
invokeTag('message','g',120,['code':("dailyfood")],-1)
printHtmlPart(24)
invokeTag('select','g',130,['name':("devotion"),'id':("devotion"),'class':("commentaries"),'noSelection':(['':'']),'from':(devotions),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':(remoteFunction(
		           controller:'gbook',
		           action:'devotion',
		           params:'\'devotion=\' + escape(this.value)',
		           onComplete:'updateForm(e)'))],-1)
printHtmlPart(25)
invokeTag('message','g',134,['code':("oldtool")],-1)
printHtmlPart(26)
invokeTag('message','g',143,['code':("total")],-1)
printHtmlPart(27)
expressionOut.print(total)
printHtmlPart(28)
invokeTag('message','g',151,['code':("default.paginate.prev")],-1)
printHtmlPart(29)
invokeTag('message','g',152,['code':("default.paginate.next")],-1)
printHtmlPart(30)
invokeTag('message','g',155,['code':("strongs")],-1)
printHtmlPart(31)
invokeTag('message','g',159,['code':("verseperline")],-1)
printHtmlPart(32)
createTagBody(1, {->
invokeTag('message','g',167,['code':("locale.language.zh")],-1)
})
invokeTag('link','g',167,['action':("language_change"),'params':([lang:'zh_CN']),'title':("click to use Chinese")],1)
printHtmlPart(33)
createTagBody(1, {->
invokeTag('message','g',169,['code':("locale.language.en")],-1)
})
invokeTag('link','g',169,['action':("language_change"),'params':([lang:'en_US']),'title':("click to use English")],1)
printHtmlPart(34)
invokeTag('message','g',171,['code':("donation")],-1)
printHtmlPart(35)
invokeTag('message','g',178,['code':("books")],-1)
printHtmlPart(36)
if(true && (bibles)) {
printHtmlPart(37)
loop:{
int i = 0
for( b in (bibles) ) {
printHtmlPart(38)
expressionOut.print(b.shortname)
printHtmlPart(39)
expressionOut.print(b)
printHtmlPart(40)
expressionOut.print(b.key)
printHtmlPart(41)
expressionOut.print(b.shortname)
printHtmlPart(42)
i++
}
}
printHtmlPart(43)
}
printHtmlPart(44)
invokeTag('message','g',199,['code':("chapters")],-1)
printHtmlPart(45)
expressionOut.print(results)
printHtmlPart(46)
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
