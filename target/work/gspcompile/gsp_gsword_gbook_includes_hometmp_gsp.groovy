import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_includes_hometmp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/includes/_hometmp.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('javascript','g',2,['library':("application")],-1)
printHtmlPart(1)
invokeTag('modalIncludes','modalbox',3,[:],-1)
printHtmlPart(1)
invokeTag('autoComplete','resource',4,['skin':("default")],-1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',9,['code':("studio")],-1)
printHtmlPart(4)
invokeTag('message','g',13,['code':("help")],-1)
printHtmlPart(5)
invokeTag('message','g',18,['code':("searchword")],-1)
printHtmlPart(6)
invokeTag('autoComplete','richui',22,['name':("keyword"),'action':(createLinkTo('dir': 'gbook/listkey'))],-1)
printHtmlPart(7)
invokeTag('message','g',25,['code':("searchbible")],-1)
printHtmlPart(8)
invokeTag('select','g',30,['name':("books"),'id':("books"),'class':("books"),'noSelection':(["${version}":"${version}"]),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchBible();")],-1)
printHtmlPart(9)
invokeTag('message','g',33,['code':("lookup")],-1)
printHtmlPart(10)
invokeTag('message','g',37,['code':("parallelbible")],-1)
printHtmlPart(11)
invokeTag('select','g',41,['name':("parallels"),'class':("parallels"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name")],-1)
printHtmlPart(12)
invokeTag('message','g',48,['code':("choosebook")],-1)
printHtmlPart(13)
invokeTag('select','g',60,['name':("bibles"),'id':("bibles"),'class':("bibles"),'noSelection':(['':'']),'from':(bibles),'optionValue':("shortname"),'optionKey':("key"),'onchange':(remoteFunction(
           controller:'gbook',
           action:'getChaps',
           params:'\'bible=\' + escape(this.value)',
           onComplete:'updateChapters(e)'))],-1)
printHtmlPart(7)
invokeTag('message','g',63,['code':("oneyearbible")],-1)
printHtmlPart(14)
invokeTag('select','g',67,['name':("dailyword"),'class':("dailyword"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("showword(this.value); ")],-1)
printHtmlPart(15)
invokeTag('createLink','modalbox',73,['controller':("gbook"),'action':("adsearch"),'title':("Advanced Search"),'width':("400"),'linkname':("Advanced Search")],-1)
printHtmlPart(16)
invokeTag('message','g',81,['code':("lookupdict")],-1)
printHtmlPart(17)
invokeTag('select','g',86,['name':("dictionaries"),'id':("dictionaries"),'class':("dictionaries"),'noSelection':(['easton':'Eastons Bible Dictionary']),'from':(dictionaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchDictionary(); ")],-1)
printHtmlPart(18)
invokeTag('message','g',88,['code':("verse")],-1)
printHtmlPart(19)
expressionOut.print(ref)
printHtmlPart(20)
invokeTag('message','g',95,['code':("lookup")],-1)
printHtmlPart(21)
invokeTag('message','g',96,['code':("commentaries")],-1)
printHtmlPart(22)
invokeTag('select','g',106,['name':("commentaries"),'id':("commentaries"),'class':("commentaries"),'noSelection':(['':'']),'from':(commentaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':(remoteFunction(
		           controller:'gbook',
		           action:'xindex',
		           params:'\'type=\' + escape(this.value)',
		           onComplete:'updateForm(e)'))],-1)
printHtmlPart(23)
invokeTag('message','g',114,['code':("choosechapter")],-1)
printHtmlPart(13)
invokeTag('select','g',122,['name':("chapters"),'class':("chapters"),'noSelection':(['':'']),'from':(chapters),'onchange':("updateReference(\$(\'bibles\').value+\' \'+ escape(this.value));")],-1)
printHtmlPart(24)
invokeTag('message','g',123,['code':("dailyfood")],-1)
printHtmlPart(25)
invokeTag('select','g',133,['name':("devotion"),'id':("devotion"),'class':("commentaries"),'noSelection':(['':'']),'from':(devotions),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':(remoteFunction(
		           controller:'gbook',
		           action:'devotion',
		           params:'\'devotion=\' + escape(this.value)',
		           onComplete:'updateForm(e)'))],-1)
printHtmlPart(26)
invokeTag('message','g',137,['code':("oldtool")],-1)
printHtmlPart(27)
invokeTag('message','g',146,['code':("total")],-1)
printHtmlPart(28)
expressionOut.print(total)
printHtmlPart(29)
invokeTag('message','g',154,['code':("default.paginate.prev")],-1)
printHtmlPart(30)
invokeTag('message','g',155,['code':("default.paginate.next")],-1)
printHtmlPart(31)
invokeTag('message','g',158,['code':("strongs")],-1)
printHtmlPart(32)
invokeTag('message','g',162,['code':("verseperline")],-1)
printHtmlPart(33)
createTagBody(2, {->
invokeTag('message','g',170,['code':("locale.language.zh")],-1)
})
invokeTag('link','g',170,['action':("language_change"),'params':([lang:'zh_CN']),'title':("click to use Chinese")],2)
printHtmlPart(34)
createTagBody(2, {->
invokeTag('message','g',172,['code':("locale.language.en")],-1)
})
invokeTag('link','g',172,['action':("language_change"),'params':([lang:'en_US']),'title':("click to use English")],2)
printHtmlPart(35)
invokeTag('message','g',174,['code':("donation")],-1)
printHtmlPart(36)
invokeTag('message','g',181,['code':("books")],-1)
printHtmlPart(37)
if(true && (bibles)) {
printHtmlPart(38)
loop:{
int i = 0
for( b in (bibles) ) {
printHtmlPart(39)
expressionOut.print(b.shortname)
printHtmlPart(40)
expressionOut.print(b)
printHtmlPart(41)
expressionOut.print(b.key)
printHtmlPart(42)
expressionOut.print(b.shortname)
printHtmlPart(43)
i++
}
}
printHtmlPart(44)
}
printHtmlPart(45)
invokeTag('message','g',202,['code':("chapters")],-1)
printHtmlPart(46)
expressionOut.print(results)
printHtmlPart(47)
})
invokeTag('form','g',212,[:],1)
printHtmlPart(48)
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
