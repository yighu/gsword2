import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbookabout_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/about.gsp" }
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
createTagBody(2, {->
printHtmlPart(6)
expressionOut.print(remoteFunction(
             controller: 'gbook',
             action: 'fetchCommentForm',
             onComplete: 'updateAuxForm(e)'))
printHtmlPart(7)
})
invokeTag('javascript','g',42,[:],2)
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
invokeTag('message','g',49,['code':("welcome")],-1)
printHtmlPart(11)
invokeTag('message','g',56,['code':("readbible")],-1)
printHtmlPart(12)
invokeTag('message','g',58,['code':("searchthebible")],-1)
printHtmlPart(13)
invokeTag('message','g',61,['code':("researchbible")],-1)
printHtmlPart(14)
invokeTag('message','g',64,['code':("classics")],-1)
printHtmlPart(15)
invokeTag('message','g',67,['code':("commentary")],-1)
printHtmlPart(16)
invokeTag('message','g',70,['code':("dictionarylookup")],-1)
printHtmlPart(17)
invokeTag('message','g',72,['code':("meditate")],-1)
printHtmlPart(18)
invokeTag('message','g',73,['code':("memorize")],-1)
printHtmlPart(19)
createTagBody(2, {->
invokeTag('message','g',75,['code':("oneyearbiblechinese")],-1)
})
invokeTag('link','g',75,['controller':("gbook"),'action':("oneyearbible"),'title':("One Year Through Bible")],2)
printHtmlPart(20)
invokeTag('message','g',76,['code':("help")],-1)
printHtmlPart(21)
invokeTag('message','g',81,['code':("quicksearch")],-1)
printHtmlPart(22)
invokeTag('message','g',84,['code':("enterkey")],-1)
printHtmlPart(23)
invokeTag('render','g',85,['template':("/bible/includes/searchbible")],-1)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',97,['code':("readdaily")],-1)
})
invokeTag('link','g',97,['controller':("gbook"),'action':("oneyearbible"),'title':("One Year Through Bible")],2)
printHtmlPart(25)
invokeTag('message','g',100,['code':("subscribe")],-1)
printHtmlPart(26)
createTagBody(2, {->
invokeTag('message','g',106,['code':("facetoface")],-1)
})
invokeTag('link','g',106,['controller':("prayer"),'action':("index"),'title':("Face to Face with God, Pray His Word")],2)
printHtmlPart(27)
createTagBody(2, {->
invokeTag('message','g',107,['code':("closet")],-1)
})
invokeTag('link','g',107,['controller':("closet"),'action':("index.html"),'title':("Closet")],2)
printHtmlPart(28)
createClosureForHtmlPart(29, 2)
invokeTag('link','g',114,['controller':("gbook"),'action':("feeds"),'title':("Daily twitts")],2)
printHtmlPart(30)
invokeTag('message','g',121,['code':("introduction")],-1)
printHtmlPart(31)
invokeTag('message','g',131,['code':("feed")],-1)
printHtmlPart(32)
invokeTag('createLink','modalbox',132,['controller':("gbook"),'action':("contactus"),'title':("Contact us/Feedback"),'width':("400"),'linkname':("Contact us/Feedback")],-1)
printHtmlPart(33)
invokeTag('message','g',133,['code':("oldtool")],-1)
printHtmlPart(34)
invokeTag('message','g',136,['code':("donation")],-1)
printHtmlPart(35)
invokeTag('message','g',138,['code':("comment")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',157,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402286425000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
