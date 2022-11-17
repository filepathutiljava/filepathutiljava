package filepathutiljava

import spock.lang.Specification

class ASpec extends Specification {
    def 'root'() {
        when:
        String p = Path.root(parts)
        then:
        p == joined
        where:
        parts               | joined
        ['a', 'b/', '/c']   | '/a/b/c'
        ['/a', '/b/', 'c/'] | '/a/b/c'
        []                  | '/'
    }

    def 'rootTail'() {
        when:
        String p = Path.rootTail(parts)
        then:
        p == joined
        where:
        parts               | joined
        ['a', 'b/', '/c']   | '/a/b/c/'
        ['/a', '/b/', 'c/'] | '/a/b/c/'
        ['/a', '//b//', 'c/'] | '/a//b//c/'
        []                  | '/'
    }
}
