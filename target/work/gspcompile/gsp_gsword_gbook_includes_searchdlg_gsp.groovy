import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_includes_searchdlg_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/includes/_searchdlg.gsp" }
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
invokeTag('message','g',15,['code':("help")],-1)
printHtmlPart(4)
invokeTag('message','g',21,['code':("searchword")],-1)
printHtmlPart(5)
invokeTag('message','g',26,['code':("bible")],-1)
printHtmlPart(6)
invokeTag('select','g',30,['name':("books"),'id':("books"),'class':("books"),'noSelection':(["${version}":"${version}"]),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchBible();"),'ontouchend':("searchBible();"),'onclick':("searchBible();")],-1)
printHtmlPart(7)
invokeTag('message','g',33,['code':("parallelbible")],-1)
printHtmlPart(8)
invokeTag('select','g',36,['name':("parallels"),'class':("books"),'onchange':("flip_parallel();"),'ontouchend':("flip_parallel();"),'onclick':("flip_parallel();"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name")],-1)
printHtmlPart(9)
invokeTag('message','g',39,['code':("choosebook")],-1)
printHtmlPart(10)
invokeTag('select','g',51,['name':("bibles"),'id':("bibles"),'class':("bibles"),'noSelection':(['':'']),'from':(bibles),'optionValue':("shortname"),'optionKey':("key"),'onchange':(remoteFunction(
           controller:'gbook',
           action:'getChaps',
           params:'\'bible=\' + escape(this.value)',
           onComplete:'updateChapters(e)'))],-1)
printHtmlPart(11)
invokeTag('message','g',55,['code':("oneyearbible")],-1)
printHtmlPart(12)
invokeTag('select','g',59,['name':("dailyword"),'class':("dailyword"),'noSelection':(['':'']),'from':(books),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("showword(this.value); ")],-1)
printHtmlPart(13)
invokeTag('createLink','modalbox',64,['controller':("gbook"),'action':("adsearch"),'title':("Advanced Search"),'width':("400"),'linkname':("Advanced Search")],-1)
printHtmlPart(14)
invokeTag('message','g',72,['code':("verse")],-1)
printHtmlPart(15)
expressionOut.print(ref)
printHtmlPart(16)
invokeTag('message','g',77,['code':("dictionary")],-1)
printHtmlPart(17)
invokeTag('select','g',80,['name':("dictionaries"),'id':("dictionaries"),'class':("dictionaries"),'noSelection':(['easton':'Eastons Bible Dictionary']),'from':(dictionaries),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':("searchDictionary();"),'onclick':("searchDictionary();")],-1)
printHtmlPart(18)
invokeTag('message','g',84,['code':("commentaries")],-1)
printHtmlPart(19)
invokeTag('select','g',88,['onchange':("flip_commentary();"),'ontouchend':("flip_commentary();"),'onclick':("flip_commentary();"),'name':("commentaries"),'id':("commentaries"),'class':("books"),'noSelection':(['':'']),'from':(commentaries),'value':("name"),'optionKey':("initials"),'optionValue':("name")],-1)
printHtmlPart(20)
invokeTag('message','g',91,['code':("choosechapter")],-1)
printHtmlPart(10)
invokeTag('select','g',96,['name':("chapters"),'class':("chapters"),'noSelection':(['':'']),'from':(chapters),'onchange':("updateReference(\$(\'bibles\').value+\' \'+ escape(this.value));")],-1)
printHtmlPart(21)
invokeTag('message','g',100,['code':("dailyfood")],-1)
printHtmlPart(22)
invokeTag('select','g',109,['name':("devotion"),'id':("devotion"),'class':("commentaries"),'noSelection':(['':'']),'from':(devotions),'value':("name"),'optionKey':("initials"),'optionValue':("name"),'onchange':(remoteFunction(
		           controller:'gbook',
		           action:'devotion',
		           params:'\'devotion=\' + escape(this.value)',
		           onComplete:'updateForm(e)'))],-1)
printHtmlPart(23)
invokeTag('message','g',113,['code':("oldtool")],-1)
printHtmlPart(24)
invokeTag('message','g',125,['code':("total")],-1)
printHtmlPart(25)
expressionOut.print(total)
printHtmlPart(26)
invokeTag('message','g',129,['code':("default.paginate.prev")],-1)
printHtmlPart(27)
invokeTag('message','g',130,['code':("default.paginate.next")],-1)
printHtmlPart(28)
invokeTag('message','g',133,['code':("strongs")],-1)
printHtmlPart(29)
invokeTag('message','g',137,['code':("morphology")],-1)
printHtmlPart(30)
invokeTag('message','g',141,['code':("notes")],-1)
printHtmlPart(31)
invokeTag('message','g',144,['code':("headings")],-1)
printHtmlPart(32)
invokeTag('message','g',147,['code':("xref")],-1)
printHtmlPart(33)
invokeTag('message','g',150,['code':("verseperline")],-1)
printHtmlPart(34)
invokeTag('message','g',156,['code':("comment")],-1)
printHtmlPart(35)
invokeTag('message','g',158,['code':("help")],-1)
printHtmlPart(36)
invokeTag('message','g',160,['code':("AdvancedSearch")],-1)
printHtmlPart(37)
invokeTag('message','g',169,['code':("books")],-1)
printHtmlPart(38)
if(true && (bibles)) {
printHtmlPart(39)
loop:{
int i = 0
for( b in (bibles) ) {
printHtmlPart(40)
expressionOut.print(b.shortname)
printHtmlPart(41)
expressionOut.print(b)
printHtmlPart(42)
expressionOut.print(b.key)
printHtmlPart(43)
expressionOut.print(b.shortname)
printHtmlPart(44)
i++
}
}
printHtmlPart(45)
}
printHtmlPart(46)
invokeTag('message','g',183,['code':("chapters")],-1)
printHtmlPart(47)
expressionOut.print(results)
printHtmlPart(48)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402286454000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
