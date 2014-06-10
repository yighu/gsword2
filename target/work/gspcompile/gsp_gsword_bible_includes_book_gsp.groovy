import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_book_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_book.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (bible)) {
printHtmlPart(2)
invokeTag('message','g',9,['code':("searchbible")],-1)
printHtmlPart(3)
expressionOut.print(book.initials)
printHtmlPart(4)
expressionOut.print(book.name)
printHtmlPart(5)
expressionOut.print(book.name)
printHtmlPart(6)
if(true && (chapters)) {
printHtmlPart(7)
expressionOut.print(bible.shortname)
printHtmlPart(8)
invokeTag('message','g',13,['code':("chapters")],-1)
printHtmlPart(9)

for (int chapter=1;chapter<=chapters;chapter++) {

printHtmlPart(10)
expressionOut.print(book.initials)
printHtmlPart(11)
expressionOut.print(bible.key)
printHtmlPart(11)
expressionOut.print(chapter)
printHtmlPart(4)
expressionOut.print(chapter)
printHtmlPart(5)
expressionOut.print(chapter)
printHtmlPart(12)

}

printHtmlPart(13)
}
printHtmlPart(1)
}
printHtmlPart(14)
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
