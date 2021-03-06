def foo(baz=None):
    def _foo(func):
        def wrapper(*args, **kwargs):
            func(*args, **kwargs)

        wrapper.baz = baz
        return wrapper

    return _foo


@foo
# <ref>
def foo():
    pass