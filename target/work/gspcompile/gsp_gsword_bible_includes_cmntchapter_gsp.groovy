import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_cmntchapter_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_cmntchapter.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (book)) {
printHtmlPart(2)
invokeTag('message','g',9,['code':("allcomnts")],-1)
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

for (int chapter=1;chapter<=chapters;chapter++) {

printHtmlPart(11)
if(true && (chap)) {
printHtmlPart(12)
if(true && (Integer.parseInt(chap)==chapter)) {
printHtmlPart(12)
expressionOut.print(chapter)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(book.initials)
printHtmlPart(8)
expressionOut.print(bible.key)
printHtmlPart(8)
expressionOut.print(chapter)
printHtmlPart(4)
expressionOut.print(chapter)
printHtmlPart(15)
expressionOut.print(chapter)
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)

}

printHtmlPart(19)
}
printHtmlPart(20)
if(true && (chap)) {
printHtmlPart(21)
expressionOut.print(verses)
printHtmlPart(22)
expressionOut.print(book.initials)
printHtmlPart(8)
expressionOut.print(bible.key)
printHtmlPart(8)
expressionOut.print(chap)
printHtmlPart(4)
expressionOut.print(chap)
printHtmlPart(5)
expressionOut.print(chap)
printHtmlPart(23)
if(true && (verses)) {
printHtmlPart(24)

for (int verse = 1; verse <= verses; verse++) {

printHtmlPart(25)
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
printHtmlPart(26)

}

printHtmlPart(27)
}
printHtmlPart(28)
}
printHtmlPart(29)
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
