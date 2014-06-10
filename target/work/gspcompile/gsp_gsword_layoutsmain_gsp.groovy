import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',3,['default':("GSword")],-1)
})
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
invokeTag('layoutResources','r',11,[:],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',37,['code':("home")],-1)
printHtmlPart(5)
invokeTag('message','g',39,['code':("bible")],-1)
printHtmlPart(6)
invokeTag('message','g',44,['code':("readbible")],-1)
printHtmlPart(7)
invokeTag('message','g',46,['code':("searchthebible")],-1)
printHtmlPart(8)
invokeTag('message','g',47,['code':("commentary")],-1)
printHtmlPart(9)
invokeTag('message','g',48,['code':("classics")],-1)
printHtmlPart(10)
invokeTag('message','g',49,['code':("general")],-1)
printHtmlPart(11)
invokeTag('message','g',50,['code':("dictionarylookup")],-1)
printHtmlPart(12)
invokeTag('message','g',56,['code':("translate")],-1)
printHtmlPart(13)
invokeTag('message','g',60,['code':("translate")],-1)
printHtmlPart(14)
invokeTag('message','g',67,['code':("feed")],-1)
printHtmlPart(15)
invokeTag('message','g',72,['code':("oneyearbible")],-1)
printHtmlPart(16)
invokeTag('message','g',73,['code':("dailyfood")],-1)
printHtmlPart(17)
invokeTag('message','g',74,['code':("meditate")],-1)
printHtmlPart(18)
invokeTag('message','g',75,['code':("prayer")],-1)
printHtmlPart(19)
invokeTag('message','g',76,['code':("closet")],-1)
printHtmlPart(20)
invokeTag('message','g',82,['code':("gsword")],-1)
printHtmlPart(21)
invokeTag('message','g',83,['code':("takenote")],-1)
printHtmlPart(22)
invokeTag('message','g',84,['code':("about")],-1)
printHtmlPart(23)
invokeTag('message','g',85,['code':("oldtool")],-1)
printHtmlPart(24)
invokeTag('message','g',90,['code':("changelanguage")],-1)
printHtmlPart(25)
invokeTag('message','g',96,['code':("locale.language.zh")],-1)
printHtmlPart(26)
invokeTag('message','g',97,['code':("locale.language.en")],-1)
printHtmlPart(27)
invokeTag('layoutBody','g',104,[:],-1)
printHtmlPart(28)
invokeTag('layoutResources','r',105,[:],-1)
printHtmlPart(29)
invokeTag('message','g',111,['code':("takenote")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',129,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402284731000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
