import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_chapter_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_chapter.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (book)) {
printHtmlPart(2)
invokeTag('message','g',9,['code':("searchbible")],-1)
printHtmlPart(3)
expressionOut.print(book.initials)
printHtmlPart(4)
expressionOut.print(book.name)
printHtmlPart(5)
expressionOut.print(book.name)
printHtmlPart(6)
if(true && (bible)) {
printHtmlPart(7)
expressionOut.print(book.initials)
printHtmlPart(8)
expressionOut.print(bible.key)
printHtmlPart(4)
expressionOut.print(bible.shortname)
printHtmlPart(5)
expressionOut.print(bible.shortname)
printHtmlPart(9)
if(true && (chapters)) {
printHtmlPart(10)
invokeTag('message','g',16,['code':("chapters")],-1)
printHtmlPart(11)

for (int chapter=1;chapter<=chapters;chapter++) {

printHtmlPart(12)
if(true && (chap)) {
printHtmlPart(13)
if(true && (Integer.parseInt(chap)==chapter)) {
printHtmlPart(13)
expressionOut.print(chapter)
printHtmlPart(14)
}
else {
printHtmlPart(15)
expressionOut.print(book.initials)
printHtmlPart(8)
expressionOut.print(bible.key)
printHtmlPart(8)
expressionOut.print(chapter)
printHtmlPart(4)
expressionOut.print(chapter)
printHtmlPart(16)
expressionOut.print(chapter)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)

}

printHtmlPart(20)
}
printHtmlPart(21)
if(true && (chap)) {
printHtmlPart(22)
invokeTag('message','g',29,['code':("verseof")],-1)
printHtmlPart(23)
expressionOut.print(book.initials)
printHtmlPart(8)
expressionOut.print(bible.key)
printHtmlPart(8)
expressionOut.print(chap)
printHtmlPart(4)
expressionOut.print(chap)
printHtmlPart(5)
expressionOut.print(chap)
printHtmlPart(24)
if(true && (verses)) {
printHtmlPart(25)

for (int verse = 1; verse <= verses; verse++) {

printHtmlPart(26)
expressionOut.print(book.initials)
printHtmlPart(8)
expressionOut.print(bible.key)
printHtmlPart(8)
expressionOut.print(chap)
printHtmlPart(8)
expressionOut.print(verse)
printHtmlPart(4)
expressionOut.print(verse)
printHtmlPart(5)
expressionOut.print(verse)
printHtmlPart(27)

}

printHtmlPart(28)
}
printHtmlPart(29)
}
printHtmlPart(30)
}
printHtmlPart(1)
}
printHtmlPart(0)
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
