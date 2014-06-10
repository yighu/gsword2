import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_about_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/_about.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("welcome")],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
invokeTag('javascript','g',9,['library':("prototype")],-1)
printHtmlPart(5)
invokeTag('javascript','g',10,['library':("application")],-1)
printHtmlPart(5)
invokeTag('modalIncludes','modalbox',11,[:],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
invokeTag('message','g',16,['code':("welcome")],-1)
printHtmlPart(8)
invokeTag('message','g',23,['code':("readbible")],-1)
printHtmlPart(9)
invokeTag('message','g',25,['code':("searchthebible")],-1)
printHtmlPart(10)
invokeTag('message','g',28,['code':("researchbible")],-1)
printHtmlPart(11)
invokeTag('message','g',31,['code':("classics")],-1)
printHtmlPart(12)
invokeTag('message','g',34,['code':("commentary")],-1)
printHtmlPart(13)
invokeTag('message','g',37,['code':("dictionarylookup")],-1)
printHtmlPart(14)
invokeTag('message','g',39,['code':("meditate")],-1)
printHtmlPart(15)
invokeTag('message','g',40,['code':("memorize")],-1)
printHtmlPart(16)
createTagBody(2, {->
invokeTag('message','g',42,['code':("oneyearbiblechinese")],-1)
})
invokeTag('link','g',42,['controller':("gbook"),'action':("oneyearbible"),'title':("One Year Through Bible")],2)
printHtmlPart(17)
invokeTag('message','g',43,['code':("help")],-1)
printHtmlPart(18)
invokeTag('message','g',48,['code':("quicksearch")],-1)
printHtmlPart(19)
invokeTag('message','g',51,['code':("enterkey")],-1)
printHtmlPart(20)
invokeTag('render','g',52,['template':("/bible/includes/searchbible")],-1)
printHtmlPart(21)
createTagBody(2, {->
invokeTag('message','g',64,['code':("readdaily")],-1)
})
invokeTag('link','g',64,['controller':("gbook"),'action':("oneyearbible"),'title':("One Year Through Bible")],2)
printHtmlPart(22)
invokeTag('message','g',67,['code':("subscribe")],-1)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',73,['code':("facetoface")],-1)
})
invokeTag('link','g',73,['controller':("prayer"),'action':("index"),'title':("Face to Face with God, Pray His Word")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',74,['code':("closet")],-1)
})
invokeTag('link','g',74,['controller':("closet"),'action':("index.html"),'title':("Closet")],2)
printHtmlPart(25)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',81,['controller':("gbook"),'action':("feeds"),'title':("Daily twitts")],2)
printHtmlPart(27)
invokeTag('message','g',88,['code':("introduction")],-1)
printHtmlPart(28)
invokeTag('message','g',98,['code':("feed")],-1)
printHtmlPart(29)
invokeTag('createLink','modalbox',99,['controller':("gbook"),'action':("contactus"),'title':("Contact us/Feedback"),'width':("400"),'linkname':("Contact us/Feedback")],-1)
printHtmlPart(30)
invokeTag('message','g',100,['code':("oldtool")],-1)
printHtmlPart(31)
invokeTag('message','g',103,['code':("donation")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',120,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402182453000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
