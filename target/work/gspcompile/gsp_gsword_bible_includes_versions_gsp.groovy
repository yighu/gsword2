import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_versions_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_versions.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',5,['code':("searchbible")],-1)
printHtmlPart(2)

int i = -1

printHtmlPart(3)
loop:{
int x = 0
for( book in (books) ) {
printHtmlPart(4)

if (i < 2) {

printHtmlPart(4)

if (i == -1) {

printHtmlPart(5)

}

printHtmlPart(6)
expressionOut.print(book.initials)
printHtmlPart(7)
expressionOut.print(book.name)
printHtmlPart(8)
expressionOut.print(book.name)
printHtmlPart(9)

i++
        } else {

          i = 0

printHtmlPart(10)
expressionOut.print(book.initials)
printHtmlPart(7)
expressionOut.print(book.name)
printHtmlPart(11)
expressionOut.print(book.name)
printHtmlPart(12)

}

printHtmlPart(3)
x++
}
}
printHtmlPart(13)
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
