// Default config. This file is not used when using ring-graphql-playground handler.
window.GRAPHQL_PLAYGROUND_CONF = {
    endpoint: 'https://eu1.prisma.sh/public-asdf/session65/dev',
    tabs: [ {
        query: `query Rules($bar: String, $foo: Int) {
  rules {
    id
  }
}
query MyRules($bar: String, $foo: Int) {
  rules {
    id
  }
}

`,
        endpoint: 'https://eu1.prisma.sh/public-asdf/session65/dev',
        variables: '{"foo": 3, "bar": "fooz"}'
    }],
}
