import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_note_takenote_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/note/_takenote.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',1,['code':("notetitle")],-1)
printHtmlPart(1)
invokeTag('textField','g',10,['name':("notetitle"),'value':(note?.title),'onchange':("keepnote();")],-1)
printHtmlPart(2)
invokeTag('textField','g',17,['name':("noteemail"),'value':(note?.email),'onchange':("keepnote();")],-1)
printHtmlPart(3)
invokeTag('textArea','g',23,['name':("notetxt"),'rows':("25"),'cols':("50"),'value':("${note?.ref?:''}\n\n${note?.note?:''}"),'onblur':("keepnote();"),'onchange':("keepnote();")],-1)
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402337974000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
