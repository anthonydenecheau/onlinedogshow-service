echo "Tagging build with $BUILD_NAME"
export TARGET_URL="https://api.github.com/repos/anthonydenecheau/onlinedogshow-service/releases?access_token=$GITHUB_TOKEN"
echo "TARGET_URL $TARGET_URL"

body="{
  \"tag_name\": \"$BUILD_NAME\",
  \"target_commitish\": \"master\",
  \"name\": \"$BUILD_NAME\",
  \"body\": \"Release of version $BUILD_NAME\",
  \"draft\": true,
  \"prerelease\": true
}"

curl -k -X POST \
  -H "Content-Type: application/json" \
  -d "$body" \
  $TARGET_URL