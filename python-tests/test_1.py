import os
import logging
import requests

logging.basicConfig(level=logging.DEBUG)
BASE_URI = os.environ.get("BASE_URI")
log = logging.getLogger()


def test_get_posts():
    """Get /posts endpoint and assert 200 OK response"""

    log.debug(f'Using Base URI: {BASE_URI}')
    r = requests.get(f'{BASE_URI}/posts')
    assert r.status_code == 200, "Expected code 200 but got: %s" % r.status_code


def test_assert_four_results():
    """Get /posts endpoint and assert 4 items are present"""

    posts = requests.get(f'{BASE_URI}/posts').json()
    assert len(posts) == 4
    assert 'provident' in posts[0]['title']
