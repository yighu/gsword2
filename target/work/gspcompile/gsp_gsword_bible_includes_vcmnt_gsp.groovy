import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_vcmnt_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_vcmnt.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
invokeTag('message','g',5,['code':("allcomnts")],-1)
printHtmlPart(1)

int i = -1

printHtmlPart(2)
loop:{
int x = 0
for( book in (books) ) {
printHtmlPart(3)

if (i < 2) {

printHtmlPart(3)

if (i == -1) {

printHtmlPart(4)

}

printHtmlPart(5)
expressionOut.print(book.initials)
printHtmlPart(6)
expressionOut.print(book.name)
printHtmlPart(7)
expressionOut.print(book.name)
printHtmlPart(8)

i++
        } else {

          i = 0

printHtmlPart(9)
expressionOut.print(book.initials)
printHtmlPart(6)
expressionOut.print(book.name)
printHtmlPart(10)
expressionOut.print(book.name)
printHtmlPart(11)

}

printHtmlPart(2)
x++
}
}
printHtmlPart(12)
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