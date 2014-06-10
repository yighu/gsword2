import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_translate_includes_fileupload_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/translate/includes/_fileupload.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('javascript','g',1,['library':("application")],-1)
printHtmlPart(0)
createClosureForHtmlPart(1, 1)
invokeTag('uploadForm','g',30,['action':("upload")],1)
printHtmlPart(2)
expressionOut.print(fl)
printHtmlPart(3)
expressionOut.print(fl)
printHtmlPart(4)
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
