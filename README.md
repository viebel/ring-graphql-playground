# Ring-GraphQL-Playground
Jar-packaged version of Graphql playground for ring-based clojure web-apps (and other JVM apps).

The Ring-GraphQL-Playground integration is based on [Graphql playground](https://github.com/prisma-labs/graphql-playground).

## Usage

Add the dependency to your `project.clj` file
and you have full GraphQL playground ready in `/graphql-playground` on classpath.
You can override the `index.html`-page by putting a new page into your local `resources/graphql-playground`-directory.
The default URI for the GraphQL endpoint is `/graphql` but this can be changed by copying `resources/graphql-playground/conf.js` to your projects
resources dir and editing it.

## Packaging

### Initialize the submodule
```Shell
git submodule init
git submodule update
```

### New Graphql-playground version
```Shell
pushd ext/custom-graphql-playground/packages/graphql-playground-react
git fetch
git checkout <new tag>
npm install
npm run build-package # it generates files under the build subfolder
popd
git add ext/custom-graphql-playground # Update submodule to point into new graphql-playground
vim project.clj README.md # Edit version
git add project.clj README.md
git commit -m "New version"
git tag -a "v2.y.z" -m "v2.y.z"
git push --tags origin master # Push new tags and master
lein do clean, install
```
## Licence

### Graphql-playground

prisma-labs/graphql-playground is licensed under the [MIT License](https://github.com/prisma-labs/graphql-playground/blob/master/LICENSE)

### These scripts

Eclipse Public License v1.0
